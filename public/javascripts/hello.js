if (window.console) {
  console.log("Welcome to your Play application's JavaScript!");
};

$(document).ready(function(){


         $('#signup1').on("click",function(){
         jsRoutes.controllers.HomeController.signUp().ajax({
                      success: function(data){
                        $('#body').html(data);
                      },
                      error: function(){
                      $('#body').html("Signup here");
                      alert("something went wrong")
                    }

          })



      })

      $('#login1').on("click",function(){
                jsRoutes.controllers.HomeController.LogIn().ajax({
                            success: function(data){
                              $('#body').html(data);
                            },
                            error: function(){
                            $('#body').html("login here");
                            alert("somthing went wrong")
                          }

                })


            })



});

