/**
 * 
 */
 
$(document).ready(function() {
    $("input:radio[name='find-id']").click(function() {
        if($(this).val()=="email") {
            $("#email-id").attr("placeholder", "이메일");
             $("#email-id").attr("name", "email");
        }
        else  { 
            $("#email-id").attr("placeholder", "핸드폰 번호"); 
            $("#email-id").attr("name", "phone");
        }
    });
    
     $("input:radio[name='find-pass']").click(function() {
        if($(this).val()=="email") {
            $("#email-pass").attr("placeholder", "이메일");
            $("#email-pass").attr("name", "email");
        }
        else  { 
            $("#email-pass").attr("placeholder", "핸드폰 번호"); 
            $("#email-pass").attr("name", "phone");
        }
    });
});

