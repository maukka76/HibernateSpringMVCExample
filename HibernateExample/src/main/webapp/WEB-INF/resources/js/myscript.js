$(document).ready(function(){
   
   test.onclick = function(){
       console.log('button pressed');
       var options = {
           type:'GET',
           success:function(data){
               
               foobar.innerHTML = data.teacherName;
           },
           error:function(){
               foobar.innerHTML = "Oh no! Something went wrong";
           }
       };
       $.ajax("/testScript",options);
   };
    
});

