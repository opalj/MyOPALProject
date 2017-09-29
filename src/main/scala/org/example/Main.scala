package org.example

import java.net.URL
import org.opalj.br.analyses.DefaultOneStepAnalysis
import org.opalj.br.analyses.BasicReport
import org.opalj.br.analyses.Project

object Main extends DefaultOneStepAnalysis {

  override def description: String = "Counts the number of public methods."

  def doAnalyze(
    project: Project[URL],
    parameters: Seq[String],
    isInterrupted: () ⇒ Boolean): BasicReport = {

    val nativeMethods =
      for {
        classFile ← project.allClassFiles.par
        method ← classFile.methods
        if method.isPublic
      } yield method.toJava

    val publicMethodsCount = nativeMethods.size
    val r = nativeMethods.mkString(s"$publicMethodsCount public methods found:\n\t", "\n\t", "\n")

    BasicReport(r)
  }

}
