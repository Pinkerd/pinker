$(function(){
	
	
	$(".template-header-navItem").each(function(){
		$(this).click(function(){
			$(".template-header-navItem").removeClass("isActive");
			$(this).addClass("isActive");
			
		})
		
	})
	
	
	
})
