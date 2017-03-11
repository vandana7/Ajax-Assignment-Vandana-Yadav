
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
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*8.108*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.versioned("images/favicon.png")),format.raw/*10.100*/("""">
    <script src=""""),_display_(/*11.19*/routes/*11.25*/.Assets.versioned("bootstrap/js/jQuery-3.1.1.min.js")),format.raw/*11.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*12.79*/("""" type="text/javascript"></script>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.55*/routes/*13.61*/.Assets.versioned("images/favicon.png")),format.raw/*13.100*/("""">
    <script src=""""),_display_(/*14.19*/routes/*14.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*14.66*/("""" type="text/javascript"></script>
    <script type="text/javascript" src=""""),_display_(/*15.42*/routes/*15.48*/.JsController.javascriptRoutes),format.raw/*15.78*/(""""></script>

</head>
<body>
<div id = "cntainer">
<div class="container-fluid text-center">
    <h1>hello this is our home page </h1>


    <button type="button" class="btn btn-primary"  id="login1">Log In</button>
    <button type="button" class="btn btn-primary"id="signup1">Sign UP</button>


</div>
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
                  DATE: Sat Mar 11 11:19:19 IST 2017
                  SOURCE: /home/knoldus/Play/newAjax/app/views/homePage.scala.html
                  HASH: 82508838980a859d153af47da19ac781228b30fc
                  MATRIX: 526->1|622->3|650->5|795->124|809->130|882->182|960->234|974->240|1035->281|1119->338|1134->344|1195->383|1243->404|1258->410|1332->463|1416->520|1431->526|1502->576|1618->665|1633->671|1694->710|1742->731|1757->737|1819->778|1922->854|1937->860|1988->890
                  LINES: 20->1|25->1|27->3|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15
                  -- GENERATED --
              */
          