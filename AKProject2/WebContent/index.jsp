
<script src="js/jquery-1.11.2.min.js" type="text/javascript"></script>

<script>
function abhi1(){
	alert("hello ak")
	var s=$("#name").val();
	alert("name="+s);
	
	var m=$("#mobile").val();
	alert("mobile="+m);
	 
	 $.ajax({
		url:"newname",
		type:"post",
		data:{a:s,b:m},
		success:function(data){
			alert(data);
			
		},
		error:function(){
			alert("error");
		}
	});
} 

</script>

Name:-<input type="text" id="name">
Mobile:-<input type="text" id="mobile">
<button onclick="abhi1()">Ok</button>