//Get tickets dynamically 
  function getTickets ()
  {         
         var url = '/user/getTickets'; //get submit url [replace url here if desired]
		 $.ajax({
          type: "POST",
          url: url,
		  async : false,
          success: function(data){
			console.log("data: ",data );
			  
          //My code to generate dynamic grid
			for(var i=0;i<data.length;i++)
			{
			//var anchorTag = document.createElement("a");	
			//anchorTag.setAttribute("href", "/user/welcome");
				
			var gridTag = document.createElement("div");
			gridTag.setAttribute("class", "grid-container");
			gridTag.setAttribute("onClick","ticketInformation(" + data[i].id+")");
			
			
			var item1Tag = document.createElement("div");
			item1Tag.setAttribute("class", "item1");
			item1Tag.appendChild(document.createTextNode(data[i].eventName));
			
			var item1TagTextLine1 = document.createElement("p");
			item1TagTextLine1.appendChild(document.createTextNode(data[i].venue+","+data[i].location));
			
			var item2Tag = document.createElement("div");
			item2Tag.setAttribute("class", "item2");
			
			var item2TagImg = document.createElement("img");
			item2TagImg.setAttribute("src", data[i].imageUrl);
			item2TagImg.setAttribute("class", "imageSize");
			item2TagImg.setAttribute("alt", data[i].imageName);
			
			var item3Tag = document.createElement("div");
			item3Tag.setAttribute("class", "item3");
			var description = data[i].description;
			if(data[i].description.length>200)
			{
				description = data[i].description.substring(0, 200) + "...";
				
			}
			item3Tag.appendChild(document.createTextNode(description));
			
			
			var item3TagTextLine1 = document.createElement("p");
			item3TagTextLine1.appendChild(document.createTextNode(data[i].organiser));
			
		
			
			//tag1.appendChild(tag1);
			gridTag.appendChild(item1Tag).appendChild(item1TagTextLine1);
			gridTag.appendChild(item2Tag).appendChild(item2TagImg);
			gridTag.appendChild(item3Tag).appendChild(item3TagTextLine1);
			//anchorTag.appendChild(gridTag)
			document.getElementById("root").appendChild(gridTag);
			
			}

          
          
          
          }
         });	
 }


getTickets();


//direct to the specified ticket page
function ticketInformation(a)
{
	
	const id = '{"ticketId":"'+a+'"}';
	var obj = JSON.parse(id);
	
	var url = '/user/getTicketsInformation'; //get submit url [replace url here if desired]
		 $.ajax({
          type: "POST",
          url: url,
          data:obj,
		  async : false,
          success: function(data){
			console.log("data: ",data );
	        // console.log("in ticket info ",a);
	         		
	         	//		$("html").empty();
	         			
                //    $("html").replaceWith(data);
                  $('html').html(data);
               //   var newHTML = document.open("text/html", "replace");
            //newHTML.write(data);
            //newHTML.close();
       
         }
         });
         
}





