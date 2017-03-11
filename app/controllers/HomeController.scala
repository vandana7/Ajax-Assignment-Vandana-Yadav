package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class HomeController @Inject() extends Controller {



  def home = Action {
    Ok(views.html.homePage())
  }

  def signup = Action {
    Ok(views.html.signupPage())
  }

  def login = Action {
    Ok(views.html.loginPage())
  }

}
