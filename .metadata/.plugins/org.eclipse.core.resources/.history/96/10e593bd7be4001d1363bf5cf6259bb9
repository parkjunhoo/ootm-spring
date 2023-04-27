<%@page import="com.ootm.dao.headerMenu.HeaderSubMenuDTO"%>
<%@page import="com.ootm.dao.headerMenu.HeaderMenuDAOImpl"%>
<%@page import="com.ootm.dao.headerMenu.HeaderMenuDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%
ArrayList<HeaderMenuDTO> menuList = new ArrayList<HeaderMenuDTO>();

if(session.getAttribute("headerMenu") != null){
	menuList =(ArrayList<HeaderMenuDTO>) session.getAttribute("headerMenu");
}else{
	RequestDispatcher rd = request.getRequestDispatcher("/select");
	rd.include(request, response);
}

String mTextColor =  request.getParameter("mTextColor");
String smTextColor = request.getParameter("smTextColor");
String bgColor = request.getParameter("bgColor");
String bgHoverColor = request.getParameter("bgHoverColor");
String menuBtnColor = request.getParameter("menuBtnColor");

String logoDarkParam = request.getParameter("logoDark");
boolean logoDark = (logoDarkParam!=null && logoDarkParam.equals("true")) ? true : false;

String logoHoverDarkParam = request.getParameter("logoHoverDark");
boolean logoHoverDark = (logoHoverDarkParam!=null && logoHoverDarkParam.equals("true")) ? true : false;

String logoPath = "/ootm/images/logo.png";
String logoDarkPath = "/ootm/images/logoDark.png";
%>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="/ootm/component/header/header.css"/>
</head>
<body>
	<header>
		<div id="searchBarDiv">
			<div id="searchBar">
				<div class="searchLeftDiv">
					<h2>검색어 입력 후 엔터</h2>
					<div class="searchInnerDiv borderBottom2">
						<h1>#</h1>
						<form id="searchForm" name="searchForm"
							action="/ootm/jsp/search.jsp">
							<input id="headerSearchInput" type="text" name="searchPageInput">
						</form>
					</div>
				</div>
				<div class="searchRightDiv">
					<h2>추천 검색어</h2>
					<div class="searchInnerDiv">
						<span>#9부팬츠</span><span>#자체제작</span><span>#맨투맨</span>
					</div>
				</div>
			</div>
			
			<div id="searchExitBtnDiv">
				<span id="searchExitBtn">✖</span>
			</div>
			
			<div onclick="closeSearchBar()" id="searchBarBG"></div>
		</div>
		<div id="headerNav">
			<div id="headerMenuBackground"></div>
			<div id="headerNavLogoHolder">
				<a href="/ootm">
					<%String headerLogoPath = logoDark ? logoDarkPath : logoPath; %>
					<img id="headerLogoImg" src="<%=headerLogoPath %>">
				</a>
			</div>
			<div id="headerNavTextMenu">
				<ul class="menuList dropListHeader">
					<%for (HeaderMenuDTO hmd : menuList) {%>
					<li>
						<div>
							<div>
								<p><%=hmd.getName()%></p>
								<div class="menuListUnderline"></div>
							</div>
						</div>
						<ul class="dropList">
							<%for (HeaderSubMenuDTO hsmd : hmd.getSubMenu()) {%>
							<li onclick ="window.location.href='/ootm/html/product.html?category=<%=hsmd.getName() %>'" 
								onmouseover="changeText(this , '<%= hsmd.getKorName()%>')" 
								onmouseleave="changeText(this , '<%= hsmd.getName()%>')">
								<p
									<%if (hsmd.getHighlight()) {%> style="color: red;" <%}%>>
									<%=hsmd.getName()%>
								</p>
							</li>
							<%}%>
						</ul>
					</li>
					<%
					}
					%>
				</ul>
			</div>
			<div id="headerNavIconMenu">
				<svg id="headerMemeberBtn" width="48" height="48"
					viewBox="0 96 960 960">
					<path
						d="M479.956 563q-76.826 0-124.391-48.065Q308 466.87 308 390.704q0-76.167 47.406-123.935Q402.812 219 479.637 219q76.826 0 125.094 47.656Q653 314.312 653 391.204q0 75.666-48.109 123.731Q556.781 563 479.956 563ZM138 926V810.205q0-43.979 22.828-76.61T220 684q68-32 131.72-47 63.721-15 127.772-15 65.97 0 128.739 16 62.769 16 130.69 46.194 37.911 15.778 60.995 48.556Q823 765.528 823 809.945V926H138Zm91-91h502v-21q0-15.353-9.7-30.063Q711.6 769.228 697 763q-60-29-109.995-39-49.996-10-108-10Q423 714 372 724.5q-51 10.5-108.571 38.344-15.679 6.584-25.054 20.976Q229 798.212 229 814v21Zm250.796-363Q514 472 537.5 448.654t23.5-57.619q0-34.685-23.296-58.36Q514.407 309 480.204 309 446 309 422.5 332.721T399 390.54q0 34.51 23.296 57.985Q445.593 472 479.796 472Zm.204-81Zm0 444Z"></path></svg>
				<svg id="headerBasketBtn" width="48" height="48"
					viewBox="0 96 960 960">
					<path
						d="M190 1016q-37.175 0-64.088-27.206Q99 961.588 99 924V414q0-37.588 26.912-64.794Q152.825 322 190 322h92q0-81 55.315-139 55.316-58 137.31-58 81.995 0 142.685 57.888Q678 240.775 678 322h92q37.588 0 64.794 27.206Q862 376.412 862 414v510q0 37.588-27.206 64.794Q807.588 1016 770 1016H190Zm0-92h580V414H190v510Zm289.625-262q81.995 0 142.685-59.953Q683 542.095 683 459h-91q0 48-32.534 80-32.535 32-79.584 32-47.049 0-79.465-32.5Q368 506 368 459h-91q0 83.34 60.315 143.17Q397.631 662 479.625 662ZM373 322h214q0-47-30.034-76-30.035-29-77.084-29-47.049 0-76.965 29.333Q373 275.667 373 322ZM190 924V414v510Z"></path></svg>
				<svg id="headerSearchBtn" width="48" height="48"
					viewBox="0 96 960 960">
					<path
						d="M794 960 525.787 692Q496 714.923 457.541 727.962 419.082 741 373.438 741q-115.311 0-193.875-78.703Q101 583.594 101 470.797T179.703 279.5q78.703-78.5 191.5-78.5T562.5 279.644Q641 358.288 641 471.15q0 45.85-13 83.35-13 37.5-38 71.5l270 268-66 66ZM371.441 650q75.985 0 127.272-51.542Q550 546.917 550 471.412q0-75.505-51.346-127.459Q447.309 292 371.529 292q-76.612 0-128.071 51.953Q192 395.907 192 471.412t51.311 127.046Q294.623 650 371.441 650Z"></path></svg>
			</div>
			<div id="headerNavMenuBtn">
				<div class="headerMenuBtnIcon"></div>
				<div class="headerMenuBtnIcon"></div>
			</div>
		</div>
		<div id="drawer"></div>
	</header>


	<script type="text/javascript">
		<%-- let _mTextColor = <%=mTextColor %>;
		let _smTextColor = <%=smTextColor %>;
		let _bgColor = <%=bgColor %>;
		let _bgHoverColor = <%=bgHover %>; --%>
		
		let header = document.getElementsByTagName("header")[0];
		header.addEventListener("mouseover", headerMouseOver);
		header.addEventListener("mouseleave", headerMouseLeave);
		
		let _searchBarDiv = document.getElementById("searchBarDiv");
		let _searchBar = document.getElementById("searchBar");
		
		let _drawer = document.getElementById("drawer");
		let _isDrawOpen = false;
		
		let _headerLogoImg = document.getElementById("headerLogoImg");
		
		let _headerNav = document.getElementById("headerNav");
		let _headerNavTextMenu = document.getElementById("headerNavTextMenu");
		let _headerNavIconMenu = document.getElementById("headerNavIconMenu");
		
		let _headerNavMenuBtn = document.getElementById("headerNavMenuBtn");
		_headerNavMenuBtn.addEventListener("click", ()=>{
			if(_isDrawOpen){
				closeDrawer();
			}else{
				openDrawer();
			}
		});
		let _searchExitBtn = document.getElementById("searchExitBtn");
		_searchExitBtn.addEventListener("click", ()=>{
			closeSearchBar();
		})
		
		
		let _headerSearchBtn = document.getElementById("headerSearchBtn");
		_headerSearchBtn.addEventListener("click", ()=>{
			if(false){ //has action check todo.
                //eval(this.getAttribute("searchBtnAction"));
            }else{
                openSearchBar();
            }
		});
		
		
		
		
	    function openSearchBar(){
	        _searchBarDiv.style.display = "block";
	        _searchBar.classList.remove("closeSearchBar");
	        _searchBar.classList.add("openSearchBar");
	        
	    }
	    function closeSearchBar(){
	        _searchBar.classList.remove("openSearchBar");
	        _searchBar.classList.add("closeSearchBar");
	        setTimeout(() => {
	            _searchBarDiv.style.display = "none";
	            _searchBar.classList.remove("closeSearchBar");
	        }, 500);
	    }
	    
	    function openDrawer(){
			if(_isDrawOpen) return;
			_isDrawOpen = true;
			_drawer.classList.remove("closeDrawerAnim");
			_drawer.classList.add("openDrawerAnim");
			document.body.style.overflow = "hidden";
	       	_drawer.appendChild(_headerNavIconMenu);
	       	_drawer.appendChild(_headerNavMenuBtn);
	       	_drawer.appendChild(_headerNavTextMenu);
		}
	    function closeDrawer(){
			if(!_isDrawOpen) return;
			_isDrawOpen = false;
			_drawer.classList.remove("openDrawerAnim");
			_drawer.classList.add("closeDrawerAnim");
			document.body.style.overflow = "auto";
			_headerNav.appendChild(_headerNavTextMenu);
			_headerNav.appendChild(_headerNavIconMenu);
			_headerNav.appendChild(_headerNavMenuBtn);
		}
	    
	    function changeText(el , str){
	    	el.firstElementChild.textContent = str;
	    }
	    
	    function headerMouseOver(){
	    	if(window.innerWidth< 1100) return;
           <%if(logoHoverDark){ %>
          		_headerLogoImg.src = "<%=logoDarkPath%>";
           <%}else{%>
          		 _headerLogoImg.src = "<%=logoPath%>";
           <%}%>
	    }
	    
	    function headerMouseLeave(){
	    	if(window.innerWidth< 1100) return;
            <%if(logoDark){ %>
            	_headerLogoImg.src = "<%=logoDarkPath%>";
          	<%}else{%>
          		_headerLogoImg.src = "<%=logoPath%>";
          	<%}%>
	    }
	    
	</script>
</body>
</html>