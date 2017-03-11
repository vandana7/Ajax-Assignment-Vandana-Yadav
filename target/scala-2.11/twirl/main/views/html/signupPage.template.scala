
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signupPage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signupPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<script src=""""),_display_(/*2.15*/routes/*2.21*/.Assets.versioned("javascripts/signup.js")),format.raw/*2.63*/("""" type="text/javascript"></script>
<form class="form-horizontal">
    <div class="form-group">
        <label class="control-label col-sm-2" for="firstname">First Name</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="firstname" placeholder="Enter firstName" name="firstname" required>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="middlename">Middle Name</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="middlename" placeholder="Enter middleName" name="middlename">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="lastname">Last Name</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="lastname" placeholder="Enter lastName" name="lastname" required>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="username">User Name</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="username" placeholder="Enter userName" name="username" required>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="pwd">Password:</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd" required>
        </div>
    </div>

    <div class="form-group">
        <label class="control-label col-sm-2" for="repwd">Re-Enter Password</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="repwd" placeholder="ReEnter password" name="repwd" required>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="mobileNo">Mobile No</label>
        <div class="col-sm-10">
            <input type="number" class="form-control" id="mobileNo" placeholder="Enter mobileNo" name="mobileNo" required>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="pwd">Gender</label>
        <div class="col-sm-10">
            <select name="gender">
                <option value="Male">Male</option>
                <option value="Female">Female</option>
            </select>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="age">Age</label>
        <div class="col-sm-10">
            <input type="number" class="form-control" id="age" placeholder="Enter age" name="age" required>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="hobbies">Hobbies</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="hobbies" placeholder="Enter hobies" name="hobbies" required>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="button" class="btn btn-default" id="signup2">Sign Up</button>
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
object signupPage extends signupPage_Scope0.signupPage
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 11:56:59 IST 2017
                  SOURCE: /home/knoldus/Play/newAjax/app/views/signupPage.scala.html
                  HASH: 1738a0cad75dec59a2f8f2561fb2c4db990b349c
                  MATRIX: 530->1|626->3|653->4|693->18|707->24|769->66
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2
                  -- GENERATED --
              */
          