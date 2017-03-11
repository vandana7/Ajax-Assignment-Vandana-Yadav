package controllers

import javax.inject.Inject

import play.api.data._
import play.api.data.Forms._
import play.api.mvc.{Action, Controller}
import model.Users
import services.CacheHandling


class SignupController @Inject()(cache:CacheHandling) extends Controller {


  def processData(firstname:String,
                  middlename:String,
                  lastname:String,
                  username:String,
                  pwd:String,
                  repwd:String,
                  mobileNo:String,
                  gender:String,
                  age:Int,
                  hobbies:String) = {
    Action {  implicit request=>

        val datafromcache=cache.dataToManage()
        val dataToCheck = Users(firstname,middlename,lastname,username,pwd,repwd, mobileNo,gender,age,hobbies)
        if(!datafromcache.contains(dataToCheck.username)){
          if(dataToCheck.pwd==dataToCheck.repwd) {
            if(dataToCheck.mobileNo.length==10) {
              cache.setValueInCache(dataToCheck.username,dataToCheck)
              Ok(views.html.profilePage(dataToCheck))
            }
            else {
              Ok(views.html.signupPage())

            }
          }
          else {
            Ok(views.html.signupPage())
          }

        }
        else {
          Ok(views.html.signupPage())
        }

      }

  }


}
