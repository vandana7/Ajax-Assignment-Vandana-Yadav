package controllers

import javax.inject._
import play.api._
import play.api.mvc._



class HomeController extends Controller {

  def index = Action {
    Ok(views.html.homePage())
  }

  def signUp=Action{
    Ok(views.html.signupPage())
  }

  def logIn=Action{
    Ok(views.html.loginPage())
  }


}
