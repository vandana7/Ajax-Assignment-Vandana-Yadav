
if (window.console) {
  console.log("Welcome to your Play application's JavaScript!");
};

$(document).ready(function(){


         $('#signup1').on("click",function(){

         jsRoutes.controllers.HomeController.signup().ajax({
                      success: function(data){
                        $('#cntainer').html(data);
                      },
                      error: function(){
                      $('#cntainer').html("Signup here");
                      alert("something went wrong")
                    }

          })



      })

      $('#login1').on("click",function(){
          
                jsRoutes.controllers.HomeController.login().ajax({
                            success: function(data){
                              $('#cntainer').html(data);
                            },
                            error: function(){
                            $('#cntainer').html("login here");
                            alert("somthing went wrong")
                          }

                })


            })



});

