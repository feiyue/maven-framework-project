/**
 * 创建TAB
 */
function _createTab(tabContainer, contentContainer, contentId, tabName){
	$("#"+tabContainer).append("<li role=\"presentation\" ><a href=\"#" + contentId + "\" data-toggle=\"tab\" id='_tab_a_"+ contentId +"'>" + tabName + "</a></li>");
	
	$("#" + contentContainer).append("<div class=\"tab-pane fade in \" id=\"" + contentId + "\">" + tabName + "</div>");
	
	$("#"+tabContainer + " #_tab_a_" + contentId).tab('show');
}

/**
 * @param contentId
 * @param tabName
 */
function createAdminTab(contentId, tabName){
	_createTab("adminTab", "adminTabContent", contentId, tabName);
}