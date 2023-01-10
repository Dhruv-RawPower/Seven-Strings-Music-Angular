      var token = '';    
         $(document).ready(function() {
        
		// jQuery ajax form submit example, runs when form is submitted
$("#register_form").submit(function(e) {
      e.preventDefault(); // prevent actual form submit
    //e.stopImmediatePropagation();
    var form = $(this);
	//console.log(form.serialize());
	var form_data = JSON.stringify(form.serialize()); 
	//console.log(form_data);
	
	
	
	$("#email").val($("#email").val().replace(/\%40/g, "@"))
	//console.log($("#email").val());
	var decoded_email = $("#email").val();
	var data = form.serialize().split("&");
    //console.log(data);
    var obj={};
    for(var key in data)
    {
        console.log(data[key]);
        obj[data[key].split("=")[0]] = data[key].split("=")[1];
    }
	
	
	obj.email = decoded_email;
	obj.role = "ROLE_USER";
    console.log(obj);
	
	
	
    var url = '/saveEmployee'; //get submit url [replace url here if desired]
    $.ajax({
         type: "POST",
         url: url,
         async: true,
        // crossDomain: true,
        // beforeSend: setHeader,
         data: obj, // serializes form input
         dataType: "text",
         
         success: function(data){
             console.log(data);
             console.log("in success function");
             window.location = "/signin";
         },
	      error: function(jqXHR,error, errorThrown) {  
           if(jqXHR.status&&jqXHR.status==400){
			   window.location = "login";
               console.log("jqXHR ",jqXHR)
               console.log("error ",error)
               console.log("errorThrown ",errorThrown) 
           }else{
			   window.location = "login";
			    console.log("jqXHR ",jqXHR)
               console.log("error ",error)
               console.log("errorThrown ",errorThrown)
               //alert("Something went wrong");
           }
      	 }
    });
}); 
});
/*
headers:{  
         "key":"your key",
		 "Accept":"application/json",//depends on your api
		 "Content-type":"application/x-www-form-urlencoded"//depends on your api
		 },*/
