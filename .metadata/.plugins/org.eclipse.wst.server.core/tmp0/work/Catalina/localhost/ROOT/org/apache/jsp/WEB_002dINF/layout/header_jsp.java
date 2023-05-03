/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-03 20:46:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.define.HeaderSubMenu;
import kr.team3.ootm.dao.header_menu.HeaderMenuDAOImpl;
import kr.team3.ootm.service.header_menu.HeaderMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import kr.team3.ootm.dao.header_sub_menu.HeaderSubMenuDTO;
import kr.team3.ootm.service.header_menu.HeaderMenuServiceImpl;
import kr.team3.ootm.dao.header_menu.HeaderMenuDTO;
import java.util.ArrayList;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("kr.team3.ootm.dao.header_sub_menu.HeaderSubMenuDTO");
    _jspx_imports_classes.add("kr.team3.ootm.service.header_menu.HeaderMenuServiceImpl");
    _jspx_imports_classes.add("kr.team3.ootm.dao.header_menu.HeaderMenuDTO");
    _jspx_imports_classes.add("util.define.HeaderSubMenu");
    _jspx_imports_classes.add("kr.team3.ootm.dao.header_menu.HeaderMenuDAOImpl");
    _jspx_imports_classes.add("org.springframework.beans.factory.annotation.Autowired");
    _jspx_imports_classes.add("kr.team3.ootm.service.header_menu.HeaderMenuService");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");

ArrayList<HeaderMenuDTO> menuList = (ArrayList<HeaderMenuDTO>)session.getAttribute("headerMenuList");
ArrayList<HeaderSubMenuDTO> subMenuList = (ArrayList<HeaderSubMenuDTO>)session.getAttribute("headerSubMenuList");

String mTextColor =  request.getParameter("mTextColor");
String smTextColor = request.getParameter("smTextColor");
String bgColor = request.getParameter("bgColor");
String bgHoverColor = request.getParameter("bgHoverColor");
String menuBtnColor = request.getParameter("menuBtnColor");

String bgScrollColor = request.getParameter("bgScrollColor");

String logoDarkParam = request.getParameter("logoDark");
boolean logoDark = (logoDarkParam!=null && logoDarkParam.equals("true")) ? true : false;

String logoHoverDarkParam = request.getParameter("logoHoverDark");
boolean logoHoverDark = (logoHoverDarkParam!=null && logoHoverDarkParam.equals("true")) ? true : false;

String logoPath = "/images/logo.png";
String logoDarkPath = "/images/logoDark.png";

String loginHref = "/login";
if(session.getAttribute("loginUser") != null){
	loginHref = "/mypage";
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/layout/header.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<div id=\"searchBarDiv\">\r\n");
      out.write("			<div id=\"searchBar\">\r\n");
      out.write("				<div class=\"searchLeftDiv\">\r\n");
      out.write("					<h2>검색어 입력 후 엔터</h2>\r\n");
      out.write("					<div class=\"searchInnerDiv borderBottom2\">\r\n");
      out.write("						<h1>#</h1>\r\n");
      out.write("						<form id=\"searchForm\" name=\"searchForm\"\r\n");
      out.write("							action=\"/search\">\r\n");
      out.write("							<input id=\"headerSearchInput\" type=\"text\" name=\"keyword\">\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"searchRightDiv\">\r\n");
      out.write("					<h2>추천 검색어</h2>\r\n");
      out.write("					<div class=\"searchInnerDiv\">\r\n");
      out.write("						<span onclick=\"location.href='/search?keyword=여름'\">#여름</span>\r\n");
      out.write("						<span onclick=\"location.href='/search?keyword=남녀공용'\">#남녀공용</span>\r\n");
      out.write("						<span onclick=\"location.href='/search?keyword=인기'\">#인기</span>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div id=\"searchExitBtnDiv\">\r\n");
      out.write("				<span id=\"searchExitBtn\">✖</span>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div onclick=\"closeSearchBar()\" id=\"searchBarBG\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div ");
if(bgColor != null){
      out.write("style=\"background-color:");
      out.print(bgColor );
      out.write(';');
      out.write('"');
}
      out.write(" id=\"headerNav\">\r\n");
      out.write("			<div ");
if(bgHoverColor != null){
      out.write("style=\"background-color:");
      out.print(bgHoverColor );
      out.write(';');
      out.write('"');
}
      out.write(" id=\"headerMenuBackground\"></div>\r\n");
      out.write("			<div id=\"headerNavLogoHolder\">\r\n");
      out.write("				<a href=\"/\">\r\n");
      out.write("					");
String headerLogoPath = logoDark ? logoDarkPath : logoPath; 
      out.write("\r\n");
      out.write("					<img id=\"headerLogoImg\" src=\"");
      out.print(headerLogoPath );
      out.write("\">\r\n");
      out.write("				</a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"headerNavTextMenu\">\r\n");
      out.write("				<ul class=\"menuList dropListHeader\">\r\n");
      out.write("					");
for (HeaderMenuDTO hmd : menuList) {
      out.write("\r\n");
      out.write("					<li>\r\n");
      out.write("						<div>\r\n");
      out.write("							<div>\r\n");
      out.write("								<p style=\"color:");
      out.print(mTextColor );
      out.write("; \">");
      out.print(hmd.getName());
      out.write("</p>\r\n");
      out.write("								<div class=\"menuListUnderline\"></div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<ul class=\"dropList\">\r\n");
      out.write("							");
for (HeaderSubMenuDTO hsmd : subMenuList) {
      out.write("\r\n");
      out.write("								");
if(hsmd.getMenuId() == hmd.getId()){ 
      out.write("\r\n");
      out.write("								<li onclick =\"window.location.href='/product/");
      out.print(HeaderSubMenu.getParam(hsmd.getId()));
      out.write("'\" \r\n");
      out.write("									onmouseover=\"changeText(this , '");
      out.print( hsmd.getKorName());
      out.write("')\" \r\n");
      out.write("									onmouseleave=\"changeText(this , '");
      out.print( hsmd.getName());
      out.write("')\">\r\n");
      out.write("									<p\r\n");
      out.write("										");
if (hsmd.getHighlight()) {
      out.write(" style=\"color: red;\"\r\n");
      out.write("										");
}else if(smTextColor!=null){
      out.write("style=\"color:");
      out.print(smTextColor );
      out.write(";\"\r\n");
      out.write("										");
}
      out.write("\r\n");
      out.write("										>\r\n");
      out.write("										");
      out.print(hsmd.getName());
      out.write("\r\n");
      out.write("									</p>\r\n");
      out.write("								</li>\r\n");
      out.write("								");
} 
      out.write("\r\n");
      out.write("							");
}
      out.write("\r\n");
      out.write("						</ul>\r\n");
      out.write("					</li>\r\n");
      out.write("					");

					}
					
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"headerNavIconMenu\"\r\n");
      out.write("			");
if(mTextColor!=null){
      out.write("style=\"fill:");
      out.print(mTextColor );
      out.write(';');
      out.write('"');
      out.write(' ');
} 
      out.write("\r\n");
      out.write("			>\r\n");
      out.write("				<svg onclick=\"location.href='");
      out.print(loginHref);
      out.write("'\" id=\"headerMemeberBtn\" width=\"48\" height=\"48\"\r\n");
      out.write("					viewBox=\"0 96 960 960\">\r\n");
      out.write("					<path\r\n");
      out.write("						d=\"M479.956 563q-76.826 0-124.391-48.065Q308 466.87 308 390.704q0-76.167 47.406-123.935Q402.812 219 479.637 219q76.826 0 125.094 47.656Q653 314.312 653 391.204q0 75.666-48.109 123.731Q556.781 563 479.956 563ZM138 926V810.205q0-43.979 22.828-76.61T220 684q68-32 131.72-47 63.721-15 127.772-15 65.97 0 128.739 16 62.769 16 130.69 46.194 37.911 15.778 60.995 48.556Q823 765.528 823 809.945V926H138Zm91-91h502v-21q0-15.353-9.7-30.063Q711.6 769.228 697 763q-60-29-109.995-39-49.996-10-108-10Q423 714 372 724.5q-51 10.5-108.571 38.344-15.679 6.584-25.054 20.976Q229 798.212 229 814v21Zm250.796-363Q514 472 537.5 448.654t23.5-57.619q0-34.685-23.296-58.36Q514.407 309 480.204 309 446 309 422.5 332.721T399 390.54q0 34.51 23.296 57.985Q445.593 472 479.796 472Zm.204-81Zm0 444Z\"></path></svg>\r\n");
      out.write("				<svg onclick=\"location.href='/basket'\" id=\"headerBasketBtn\" width=\"48\" height=\"48\"\r\n");
      out.write("					viewBox=\"0 96 960 960\">\r\n");
      out.write("					<path\r\n");
      out.write("						d=\"M190 1016q-37.175 0-64.088-27.206Q99 961.588 99 924V414q0-37.588 26.912-64.794Q152.825 322 190 322h92q0-81 55.315-139 55.316-58 137.31-58 81.995 0 142.685 57.888Q678 240.775 678 322h92q37.588 0 64.794 27.206Q862 376.412 862 414v510q0 37.588-27.206 64.794Q807.588 1016 770 1016H190Zm0-92h580V414H190v510Zm289.625-262q81.995 0 142.685-59.953Q683 542.095 683 459h-91q0 48-32.534 80-32.535 32-79.584 32-47.049 0-79.465-32.5Q368 506 368 459h-91q0 83.34 60.315 143.17Q397.631 662 479.625 662ZM373 322h214q0-47-30.034-76-30.035-29-77.084-29-47.049 0-76.965 29.333Q373 275.667 373 322ZM190 924V414v510Z\"></path></svg>\r\n");
      out.write("				<svg id=\"headerSearchBtn\" width=\"48\" height=\"48\"\r\n");
      out.write("					viewBox=\"0 96 960 960\">\r\n");
      out.write("					<path\r\n");
      out.write("						d=\"M794 960 525.787 692Q496 714.923 457.541 727.962 419.082 741 373.438 741q-115.311 0-193.875-78.703Q101 583.594 101 470.797T179.703 279.5q78.703-78.5 191.5-78.5T562.5 279.644Q641 358.288 641 471.15q0 45.85-13 83.35-13 37.5-38 71.5l270 268-66 66ZM371.441 650q75.985 0 127.272-51.542Q550 546.917 550 471.412q0-75.505-51.346-127.459Q447.309 292 371.529 292q-76.612 0-128.071 51.953Q192 395.907 192 471.412t51.311 127.046Q294.623 650 371.441 650Z\"></path></svg>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"headerNavMenuBtn\">\r\n");
      out.write("				<div ");
if(menuBtnColor!=null){
      out.write("style=\"background-color:");
      out.print(menuBtnColor );
      out.write(';');
      out.write('"');
      out.write(' ');
}
      out.write(" class=\"headerMenuBtnIcon\"></div>\r\n");
      out.write("				<div ");
if(menuBtnColor!=null){
      out.write("style=\"background-color:");
      out.print(menuBtnColor );
      out.write(';');
      out.write('"');
      out.write(' ');
}
      out.write(" class=\"headerMenuBtnIcon\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div id=\"drawer\"></div>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		\r\n");
      out.write("		let isHeaderScrollStyle = false;\r\n");
      out.write("	\r\n");
      out.write("		let header = document.getElementsByTagName(\"header\")[0];\r\n");
      out.write("		header.addEventListener(\"mouseover\", headerMouseOver);\r\n");
      out.write("		header.addEventListener(\"mouseleave\", headerMouseLeave);\r\n");
      out.write("		\r\n");
      out.write("		let _searchBarDiv = document.getElementById(\"searchBarDiv\");\r\n");
      out.write("		let _searchBar = document.getElementById(\"searchBar\");\r\n");
      out.write("		\r\n");
      out.write("		let _drawer = document.getElementById(\"drawer\");\r\n");
      out.write("		let _isDrawOpen = false;\r\n");
      out.write("		\r\n");
      out.write("		let _headerLogoImg = document.getElementById(\"headerLogoImg\");\r\n");
      out.write("		\r\n");
      out.write("		let _headerNav = document.getElementById(\"headerNav\");\r\n");
      out.write("		let _headerNavTextMenu = document.getElementById(\"headerNavTextMenu\");\r\n");
      out.write("		let _headerNavIconMenu = document.getElementById(\"headerNavIconMenu\");\r\n");
      out.write("		\r\n");
      out.write("		let _headerNavMenuBtn = document.getElementById(\"headerNavMenuBtn\");\r\n");
      out.write("		_headerNavMenuBtn.addEventListener(\"click\", ()=>{\r\n");
      out.write("			if(_isDrawOpen){\r\n");
      out.write("				closeDrawer();\r\n");
      out.write("			}else{\r\n");
      out.write("				openDrawer();\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		let _searchExitBtn = document.getElementById(\"searchExitBtn\");\r\n");
      out.write("		_searchExitBtn.addEventListener(\"click\", ()=>{\r\n");
      out.write("			closeSearchBar();\r\n");
      out.write("		})\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		let _headerSearchBtn = document.getElementById(\"headerSearchBtn\");\r\n");
      out.write("		_headerSearchBtn.addEventListener(\"click\", ()=>{\r\n");
      out.write("			if(false){ //has action check todo.\r\n");
      out.write("                //eval(this.getAttribute(\"searchBtnAction\"));\r\n");
      out.write("            }else{\r\n");
      out.write("                openSearchBar();\r\n");
      out.write("            }\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		");
if(bgScrollColor != null){
      out.write("\r\n");
      out.write("		this.addEventListener('scroll' , ()=>{\r\n");
      out.write("			//console.log(\"scroll\");\r\n");
      out.write("			if(window.scrollY == 0 && !isHeaderScrollStyle){\r\n");
      out.write("				isHeaderScrollStyle = true;\r\n");
      out.write("				header.style.backgroundColor = \"\";\r\n");
      out.write("				header.style.boxShadow = \"\";\r\n");
      out.write("			}else{\r\n");
      out.write("				isHeaderScrollStyle = false;\r\n");
      out.write("				header.style.backgroundColor = \"");
      out.print(bgScrollColor);
      out.write("\";\r\n");
      out.write("				header.style.boxShadow = \"0px 3px 5px rgba(0,0,0,0.3)\"\r\n");
      out.write("				\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		");
}
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("	    function openSearchBar(){\r\n");
      out.write("	        _searchBarDiv.style.display = \"block\";\r\n");
      out.write("	        _searchBar.classList.remove(\"closeSearchBar\");\r\n");
      out.write("	        _searchBar.classList.add(\"openSearchBar\");\r\n");
      out.write("	        \r\n");
      out.write("	    }\r\n");
      out.write("	    function closeSearchBar(){\r\n");
      out.write("	        _searchBar.classList.remove(\"openSearchBar\");\r\n");
      out.write("	        _searchBar.classList.add(\"closeSearchBar\");\r\n");
      out.write("	        setTimeout(() => {\r\n");
      out.write("	            _searchBarDiv.style.display = \"none\";\r\n");
      out.write("	            _searchBar.classList.remove(\"closeSearchBar\");\r\n");
      out.write("	        }, 500);\r\n");
      out.write("	    }\r\n");
      out.write("	    \r\n");
      out.write("	    function openDrawer(){\r\n");
      out.write("			if(_isDrawOpen) return;\r\n");
      out.write("			_isDrawOpen = true;\r\n");
      out.write("			_drawer.classList.remove(\"closeDrawerAnim\");\r\n");
      out.write("			_drawer.classList.add(\"openDrawerAnim\");\r\n");
      out.write("			document.body.style.overflow = \"hidden\";\r\n");
      out.write("	       	_drawer.appendChild(_headerNavIconMenu);\r\n");
      out.write("	       	_drawer.appendChild(_headerNavMenuBtn);\r\n");
      out.write("	       	_drawer.appendChild(_headerNavTextMenu);\r\n");
      out.write("		}\r\n");
      out.write("	    function closeDrawer(){\r\n");
      out.write("			if(!_isDrawOpen) return;\r\n");
      out.write("			_isDrawOpen = false;\r\n");
      out.write("			_drawer.classList.remove(\"openDrawerAnim\");\r\n");
      out.write("			_drawer.classList.add(\"closeDrawerAnim\");\r\n");
      out.write("			document.body.style.overflow = \"auto\";\r\n");
      out.write("			_headerNav.appendChild(_headerNavTextMenu);\r\n");
      out.write("			_headerNav.appendChild(_headerNavIconMenu);\r\n");
      out.write("			_headerNav.appendChild(_headerNavMenuBtn);\r\n");
      out.write("		}\r\n");
      out.write("	    \r\n");
      out.write("	    function changeText(el , str){\r\n");
      out.write("	    	el.firstElementChild.textContent = str;\r\n");
      out.write("	    }\r\n");
      out.write("	    \r\n");
      out.write("	    function headerMouseOver(){\r\n");
      out.write("	    	if(window.innerWidth< 1100) return;\r\n");
      out.write("           ");
if(logoHoverDark){ 
      out.write("\r\n");
      out.write("          		_headerLogoImg.src = \"");
      out.print(logoDarkPath);
      out.write("\";\r\n");
      out.write("           ");
}else{
      out.write("\r\n");
      out.write("          		 _headerLogoImg.src = \"");
      out.print(logoPath);
      out.write("\";\r\n");
      out.write("           ");
}
      out.write("\r\n");
      out.write("	    }\r\n");
      out.write("	    \r\n");
      out.write("	    function headerMouseLeave(){\r\n");
      out.write("	    	if(window.innerWidth< 1100) return;\r\n");
      out.write("            ");
if(logoDark){ 
      out.write("\r\n");
      out.write("            	_headerLogoImg.src = \"");
      out.print(logoDarkPath);
      out.write("\";\r\n");
      out.write("          	");
}else{
      out.write("\r\n");
      out.write("          		_headerLogoImg.src = \"");
      out.print(logoPath);
      out.write("\";\r\n");
      out.write("          	");
}
      out.write("\r\n");
      out.write("	    }\r\n");
      out.write("	    \r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
