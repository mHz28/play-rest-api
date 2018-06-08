
package views.html

import models._
import controllers._
import play.api.i18n._
import play.api.templates.PlayMagic._
import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import play.api.mvc._
import play.api.data._
import views.html._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!doctype html>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Play REST API</title>
  </head>

  <body>
    <h1>Play REST API</h1>

    <p>
      This is a placeholder page to show you the REST API.
    </p>

    <ul>
      <li><a href="/v1/posts">/v1/posts</a></li>
    </ul>
  </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jun 07 09:11:12 PDT 2018
                  SOURCE: C:/Users/ekwong/Downloads/tmp/play-rest-api/app/views/index.scala.html
                  HASH: b5e8abdfecb7535bdd08eb8d4b084929e022ec44
                  MATRIX: 722->1|818->3|845->4
                  LINES: 21->1|26->1|27->2
                  -- GENERATED --
              */
          