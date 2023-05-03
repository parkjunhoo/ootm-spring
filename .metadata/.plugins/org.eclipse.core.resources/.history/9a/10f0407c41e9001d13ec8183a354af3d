/**
 * 잠시 하이퍼링크연결을 위해 임시로 만들었습니당
 */
let test = document.getElementById("testID");
test.style.whiteSpace = "nowrap";
test.textContent = new URLSearchParams(location.search).get("category");

 let mainText = document.querySelector("#testID");
 
 window.addEventListener('scroll',function(){
	let value = window.scrollY;
	console.log(value);
	
	if(value>200){
		mainText.style.animation="disappear 1s ease-out forwards";
	}else{
		mainText.style.animation=`slide 1s ease-out`;
	}
});