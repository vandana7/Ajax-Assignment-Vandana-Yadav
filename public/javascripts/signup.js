 $(document).ready(function(){

 $('#signup2').on("click",function(){

                console.log($('#firstname').val())
                console.log("clicked")
                jsRoutes.controllers.SignUpController.processData($('#firstname').val(),$('#middlename').val(),
                                $('#lastname').val(),$('#username').val(),$('pwd').val(),
                                $('#repwd').val(),$('# mobileNo').val(),$('#gender').val(),
                                $('#age').val(),$('#hobbies').val()).ajax({
                            success: function(data){
                              $('#body').html(data);

                            },
                            error: function(){
                            $('#body').html("Somthing went wrong try again");
                            alert("fail to load")
                          }

                })


            })
$('#logout').on("click",function(){

                console.log("clicked")
                jsRoutes.controllers.HomeController.index().ajax({
                            success: function(data){
                              $('#body').html(data);

                            },
                            error: function(){
                            $('#body').html("somthing went wrong");
                            alert("fail to load")
                          }

                })


            })

});
