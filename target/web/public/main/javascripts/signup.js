 $(document).ready(function(){

 $('#signup2').on("click",function(){

                console.log($('#firstname').val())
                console.log("clicked")
                jsRoutes.controllers.SignupController.processData($('#firstname').val(),$('#middlename').val(),
                                $('#lastname').val(),$('#username').val(),$('#pwd').val(),
                                $('#repwd').val(),$('#mobileNo').val(),$('#gender').val(),
                                $('#age').val(),$('#hobbies').val()).ajax({
                            success: function(data){
                              $('#cntainer').html(data);

                            },
                            error: function(){
                            $('#cntainer').html("Somthing went wrong try again");
                            alert("fail to load")
                          }

                })


            })
$('#logout').on("click",function(){

                console.log("clicked")
                jsRoutes.controllers.HomeController.home().ajax({
                            success: function(data){
                              $('#cntainer').html(data);

                            },
                            error: function(){
                            $('#cntainer').html("somthing went wrong");
                            alert("fail to load")
                          }

                })


            })

});
