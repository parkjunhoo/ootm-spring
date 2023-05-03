let usp = new URLSearchParams(location.search);
let searchKeyword = usp.get("keyword");
document.searchPageForm.searchPageInput.value = searchKeyword;


function focusToSearchBar(){
    document.getElementById("searchPageInput").focus();
    
}

