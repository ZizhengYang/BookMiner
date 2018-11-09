/*
 * the functions
 */
function fadd(){

    // the width and height of the WEB PAGE
    var pWidth = document.body.scrollWidth;
    var pHeight = document.body.scrollHeight;
    // the width and height of the BROWSER WINDOW
    var bWidth = document.body.clientWidth;
    var bHeight = document.body.clientHeight;

    var oMask=document.createElement("div");
        oMask.id = "mask";
        oMask.style.height = pHeight + "px";
        oMask.style.width = pWidth + "px";
    document.body.appendChild(oMask);

    var oLogin=document.createElement("div");
        oLogin.id = "login";
        oLogin.innerHTML =
            "<div class='login'>" +
                "<div>" +
                    "<button id='confirm'>CONFIRM</button>" +
                    "<button id='close'>CLOSE</button>" +
                    "<button id='save'>SAVE</button>" +
                    "<button id='help'>HELP</button>" +
                "</div>" +
                "<div>" +
                    "<div id = 'file'></div>" +
                "</div>" +
                "<div>" +
                    "<input type = 'File'>fileInPut</input>" +
                "</div>" +
            "</div>";
    document.body.appendChild(oLogin);

    var oHeight = oLogin.offsetHeight;
    var oWidth = oLogin.offsetWidth;

    oLogin.style.left = ((bWidth - oWidth)/2) + "px";
    oLogin.style.top = 40 + "px"; //((bHeight - oHeight)/2) + "px";

    var oClose = document.getElementById("close");
        oClose.onclick=oMask.onclick=function() {
            document.body.removeChild(oLogin);
            document.body.removeChild(oMask);
        }

}

function fdelete(){

    // the width and height of the WEB PAGE
    var pWidth = document.body.scrollWidth;
    var pHeight = document.body.scrollHeight;
    // the width and height of the BROWSER WINDOW
    var bWidth = document.body.clientWidth;
    var bHeight = document.body.clientHeight;

    var oMask=document.createElement("div");
    oMask.id = "mask";
    oMask.style.height = pHeight + "px";
    oMask.style.width = pWidth + "px";
    document.body.appendChild(oMask);

    var oLogin=document.createElement("div");
    oLogin.id = "login";
    oLogin.innerHTML =
        "<div class='login'>" +
            "<div id='close'>" +
                "CLOSE" +
            "</div>" +
        "</div>";
    document.body.appendChild(oLogin);

    var oHeight=oLogin.offsetHeight;
    var oWidth=oLogin.offsetWidth;

    oLogin.style.left = ((bWidth - oWidth)/2) + "px";
    oLogin.style.top = 40 + "px"; //((bHeight - oHeight)/2) + "px";

    var oClose = document.getElementById("close");
    oClose.onclick=oMask.onclick=function() {
        document.body.removeChild(oLogin);
        document.body.removeChild(oMask);
    }


}

function fshare() {

    // the width and height of the WEB PAGE
    var pWidth = document.body.scrollWidth;
    var pHeight = document.body.scrollHeight;
    // the width and height of the BROWSER WINDOW
    var bWidth = document.body.clientWidth;
    var bHeight = document.body.clientHeight;

    var oMask=document.createElement("div");
    oMask.id = "mask";
    oMask.style.height = pHeight + "px";
    oMask.style.width = pWidth + "px";
    document.body.appendChild(oMask);

    var oLogin=document.createElement("div");
    oLogin.id = "login";
    oLogin.innerHTML =
        "<div class='login'>" +
            "<div id='close'>" +
                "CLOSE" +
            "</div>" +
        "</div>";
    document.body.appendChild(oLogin);

    var oHeight=oLogin.offsetHeight;
    var oWidth=oLogin.offsetWidth;

    oLogin.style.left = ((bWidth - oWidth)/2) + "px";
    oLogin.style.top = 40 + "px"; //((bHeight - oHeight)/2) + "px";

    var oClose = document.getElementById("close");
    oClose.onclick=oMask.onclick=function() {
        document.body.removeChild(oLogin);
        document.body.removeChild(oMask);
    }


}
//window.open("./addDialog/addDialog.html", "hahah", "width=600,height=400,top=200,left=400,menubar=no,toolbar=no,status=no,scrollbars=yes,location=no,resizable=no");
//window.open("./deleteDialog/deleteDialog.html", "hahah", "width=600,height=400,top=200,left=400,menubar=no,toolbar=no,status=no,scrollbars=yes,location=no,resizable=no");
//window.open("./shareDialog/shareDialog.html", "hahah", "width=600,height=400,top=200,left=400,menubar=no,toolbar=no,status=no,scrollbars=yes,location=no,resizable=no");