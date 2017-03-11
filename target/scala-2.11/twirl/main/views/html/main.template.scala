
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>

        <title>Home Page</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">
        <link rel="stylesheet" href=""""),_display_(/*10.39*/routes/*10.45*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*10.87*/("""">
        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.versioned("css/style.css")),format.raw/*11.79*/("""">
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.versioned("js/jquery.js")),format.raw/*12.62*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*13.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*14.70*/("""" type="text/javascript"></script>
        <script type="text/javascript" src=""""),_display_(/*15.46*/routes/*15.52*/.JsController.javascriptRoutes),format.raw/*15.82*/(""""></script>
    </head>
    <body background=""""),_display_(/*17.24*/routes/*17.30*/.Assets.versioned("images/img1.jpg")),format.raw/*17.66*/("""">

    <div class="container-fluid text-center" style="z-index:999;">
        <h1>hello this is our home page </h1>
        <!--<img src=""""),_display_(/*21.24*/routes/*21.30*/.Assets.versioned("images/img4.jpg")),format.raw/*21.66*/("""" class="img-responsive ">-->

      <button type="button" class="btn btn-primary"  id="login1">Log In</button>
       <button type="button" class="btn btn-primary"id="signup1">Sign UP</button>


    </div>
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


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 08:08:17 IST 2017
                  SOURCE: /home/knoldus/Play/Ajax/app/views/main.scala.html
                  HASH: e9824e0d109e92610781f148a386f2e4bb074785
                  MATRIX: 518->1|614->3|642->5|799->136|813->142|875->183|962->244|976->250|1036->289|1104->330|1119->336|1182->378|1250->419|1265->425|1320->459|1372->484|1387->490|1441->523|1525->580|1540->586|1601->626|1685->683|1700->689|1762->730|1869->810|1884->816|1935->846|2009->893|2024->899|2081->935|2248->1075|2263->1081|2320->1117
                  LINES: 20->1|25->1|27->3|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|41->17|41->17|41->17|45->21|45->21|45->21
                  -- GENERATED --
              */
          