
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object loginPage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class loginPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<script src=""""),_display_(/*2.15*/routes/*2.21*/.Assets.versioned("javascripts/login.js")),format.raw/*2.62*/("""" type="text/javascript"></script>
<form class="container form-group Sign">
<form class="form-horizontal">
    <div class="form-group">
        <label class="control-label col-sm-2" for="username">User Name:</label>
        <div class="col-sm-10">
            <input type="username" class="form-control" id="username" placeholder="Enter user name" name="username" required>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="pwd">Password:</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd" required>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="button" class="btn btn-default" id ="login2">Login</button>
        </div>
    </div>
</form>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object loginPage extends loginPage_Scope0.loginPage
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 10:29:34 IST 2017
                  SOURCE: /home/knoldus/Play/newAjax/app/views/loginPage.scala.html
                  HASH: c7bbec1388e23ace479b3d5e1fc6a906351152cc
                  MATRIX: 528->1|624->3|651->4|691->18|705->24|766->65
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2
                  -- GENERATED --
              */
          