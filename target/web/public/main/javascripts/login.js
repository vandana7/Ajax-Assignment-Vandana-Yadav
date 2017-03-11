$(document).ready(function(){

 $('#login2').on("click",function(){

                console.log($('#username').val())
                console.log("clicked")
                jsRoutes.controllers.LoginController.loginProcess($('#username').val(),$('#pwd').val()).ajax({
                            success: function(data){
                              $('#cntainer').html(data);

                            },
                            error: function(){
                            $('#cntainer').html("somthing wrong");
                            alert("fail")
                          }

                })


            })

});