package org.example

import java.net.URL
import org.opalj.br.analyses.DefaultOneStepAnalysis
import org.opalj.br.analyses.BasicReport
import org.opalj.br.analyses.Project

object Main extends DefaultOneStepAnalysis {

  override def description: String = "Counts the number of public methods."

  def doAnalyze(p: Project[URL], params: Seq[String], isInterrupted: () ⇒ Boolean): BasicReport = {

    val nativeMethods =
      for {
        classFile ← p.allClassFiles.par
        method ← classFile.methods
        if method.isPublic
      } yield {
        method.toJava
      }

    val publicMethodsCount = nativeMethods.size
    BasicReport(
      nativeMethods.mkString(s"$publicMethodsCount public methods found:\n\t", "\n\t", "\n"))
  }

}
