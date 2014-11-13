function addProduct(productId) {  
     
	
   	$.ajax({  
    	type : "Get",   
    	url : "/elenverve/addProduct",   
    	data : "productId=" + productId,  
    	success : function(response) {  
    		//windows.localtion.reload();
    		location.reload(false);
    	},  
    	error : function(e) {  
     		alert('Error: ' + e);   
    	}  
   });  
} 

function removeProduct(productId) {     
    
	
   	$.ajax({  
    	type : "Get",   
    	url : "/elenverve/removeProduct",   
    	data : "productId=" + productId,  
    	success : function(response) {  
    		//windows.localtion.reload();
    		//location.reload(false);
    		$(".top-bar").html( response );

    	},  
    	error : function(e) {  
     		alert('Error: ' + e);   
    	}  
   });  
} 