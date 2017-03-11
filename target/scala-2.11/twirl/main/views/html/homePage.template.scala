
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object homePage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class homePage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>

    <title>Home Page</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.versioned("images/favicon.png")),format.raw/*9.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*10.35*/routes/*10.41*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*10.83*/("""">
    <link rel="stylesheet" href=""""),_display_(/*11.35*/routes/*11.41*/.Assets.versioned("css/style.css")),format.raw/*11.75*/("""">
    <script src=""""),_display_(/*12.19*/routes/*12.25*/.Assets.versioned("js/jquery.js")),format.raw/*12.58*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*13.69*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*14.19*/routes/*14.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*14.66*/("""" type="text/javascript"></script>
        <script type="text/javascript" src=""""),_display_(/*15.46*/routes/*15.52*/.JavaScriptController.javascriptRoutes),format.raw/*15.90*/(""""></script>
</head>
<body background=""""),_display_(/*17.20*/routes/*17.26*/.Assets.versioned("images/img1.jpg")),format.raw/*17.62*/("""">

<div class="container-fluid text-center" style="z-index:999;">
    <h1>hello this is our home page </h1>
    <!--<img src=""""),_display_(/*21.20*/routes/*21.26*/.Assets.versioned("images/img4.jpg")),format.raw/*21.62*/("""" class="img-responsive ">-->

    <button type="button" class="btn btn-primary"  id="login">Log In</button>
    <button type="button" class="btn btn-primary"id="signup">Sign UP</button>


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
object homePage extends homePage_Scope0.homePage
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 01:26:10 IST 2017
                  SOURCE: /home/knoldus/Play/Ajax/app/views/homePage.scala.html
                  HASH: de6e355c3ef552771f5a5de4b53ae1e4bc53b286
                  MATRIX: 526->1|622->3|650->5|795->124|809->130|870->171|953->228|967->234|1027->273|1091->310|1106->316|1169->358|1233->395|1248->401|1303->435|1351->456|1366->462|1420->495|1504->552|1519->558|1580->598|1660->651|1675->657|1737->698|1844->778|1859->784|1918->822|1984->861|1999->867|2056->903|2211->1031|2226->1037|2283->1073
                  LINES: 20->1|25->1|27->3|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|41->17|41->17|41->17|45->21|45->21|45->21
                  -- GENERATED --
              */
          