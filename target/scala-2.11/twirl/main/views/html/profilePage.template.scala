
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profilePage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class profilePage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[model.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(data:model.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*3.1*/("""<script src=""""),_display_(/*3.15*/routes/*3.21*/.Assets.versioned("javascripts/signup.js")),format.raw/*3.63*/("""" type="text/javascript"></script>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <ul class="nav navbar-nav">
            <li>
                <button type="button" class="btn btn-default" id="logout">Log Out</button>

            </li>
        </ul>
    </div>
</nav>


<div class="row" style="margin-top:20px;">
    <div class="col-md-3" ></div>
    <div class="col-md-6 info underline" >Name:"""),_display_(/*18.49*/data/*18.53*/.firstname),format.raw/*18.63*/(""" """),_display_(/*18.65*/data/*18.69*/.middlename),format.raw/*18.80*/(""" """),_display_(/*18.82*/data/*18.86*/.lastname),format.raw/*18.95*/(""" """),format.raw/*18.96*/("""</div>
    <div class="col-md-3" ></div>
</div>

<div class="row" style="margin-top:20px;">
    <div class="col-md-4" ></div>
    <div class="col-md-4 restInfo" >UserName:"""),_display_(/*24.47*/data/*24.51*/.username),format.raw/*24.60*/("""</div>
    <div class="col-md-4" ></div>
</div>

<div class="row" style="margin-top:20px;">
    <div class="col-md-4" ></div>
    <div class="col-md-4 restInfo" >Gender:"""),_display_(/*30.45*/data/*30.49*/.gender),format.raw/*30.56*/(""" """),format.raw/*30.57*/("""</div>
    <div class="col-md-4" ></div>
</div>
<div class="row" style="margin-top:20px;">
    <div class="col-md-4" ></div>
    <div class="col-md-4 restInfo" >Age:"""),_display_(/*35.42*/data/*35.46*/.age),format.raw/*35.50*/(""" """),format.raw/*35.51*/("""</div>
    <div class="col-md-4" ></div>
</div>
<div class="row" style="margin-top:20px;">
    <div class="col-md-4" ></div>
    <div class="col-md-4 restInfo" >Hobbies:"""),_display_(/*40.46*/data/*40.50*/.hobbies),format.raw/*40.58*/("""</div>
    <div class="col-md-4" ></div>
</div>


"""))
      }
    }
  }

  def render(data:model.Users): play.twirl.api.HtmlFormat.Appendable = apply(data)

  def f:((model.Users) => play.twirl.api.HtmlFormat.Appendable) = (data) => apply(data)

  def ref: this.type = this

}


}

/**/
object profilePage extends profilePage_Scope0.profilePage
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 11:56:59 IST 2017
                  SOURCE: /home/knoldus/Play/newAjax/app/views/profilePage.scala.html
                  HASH: 6e53319e8c5558ba1d3f9e631a9f7beb082925a3
                  MATRIX: 544->1|657->19|685->21|725->35|739->41|801->83|1255->510|1268->514|1299->524|1328->526|1341->530|1373->541|1402->543|1415->547|1445->556|1474->557|1673->729|1686->733|1716->742|1913->912|1926->916|1954->923|1983->924|2176->1090|2189->1094|2214->1098|2243->1099|2440->1269|2453->1273|2482->1281
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|48->24|48->24|48->24|54->30|54->30|54->30|54->30|59->35|59->35|59->35|59->35|64->40|64->40|64->40
                  -- GENERATED --
              */
          