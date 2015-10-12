$(document).ready(function(){
	
	$('#technologyId').on('change', function(){
		
		var absoutePath = getAbsolutePath();
		
		var technologyId = $(this).val();
		
		var fullURL = absoutePath+"auth/topic/"+technologyId+"";
		$.ajax({
			     type: "POST",
			     url: fullURL,
			     data: '',
			     async: false,
			     contentType: "application/json; charset=utf-8",
			     dataType: "json",
			     success: function(data) {
			       $("#topicId").empty().append($("<option></option>").val("").html("---Topic---"));
			       $.each(data, function(key, value) {
			    	   $.each(value, function(key1, value1) {
			    		   $("#topicId").append($("<option></option>").val(value1.id).html(value1.topicName));
			    	   });
			       });
				     },
			     error: function(e) {
			    	 console.log(e);
			    	 $("#topicId").empty().append($("<option></option>").val("").html("---Topic---"));
			    	 alert("An error has occurred during processing your request.");
			     }
			     
			  });
	});
	
	function getAbsolutePath() {
	    var loc = window.location;
	    var pathName = loc.pathname.substring(0, loc.pathname.indexOf('/',2) + 1);
	    
	    return loc.href.substring(0, loc.href.length - ((loc.pathname + loc.search + loc.hash).length - pathName.length));
	}
});
