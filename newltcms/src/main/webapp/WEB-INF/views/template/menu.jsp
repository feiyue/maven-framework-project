<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<aside class="sidebar" style="width: 200px;">
      <nav class="sidebar-nav">
        <ul class="metismenu" id="menu">
          <li class="active">
            <a href="#" aria-expanded="true">
              <span class="glyphicon glyphicon-list"></span>
              <span class="sidebar-nav-item">权限</span>
              <span class="glyphicon arrow"></span>
            </a>
            <ul aria-expanded="true">
              <li>
                <a href="javascript:void(0)" onclick="createAdminTab('userconfig', '用户配置')">
                  <span class="glyphicon glyphicon-triangle-right"></span>
                  用户配置
                </a>
              </li>
              <li>
                <a href="https://github.com/onokumus/metisMenu">
                  <span class="glyphicon glyphicon-triangle-right"></span>
                  Star
                </a>
              </li>
              <li>
                <a href="https://github.com/onokumus/metisMenu/issues">
                  <span class="glyphicon glyphicon-triangle-right"></span>
                  Issues
                </a>
              </li>
            </ul>
          </li>
          <li>
            <a href="#" aria-expanded="false">
            <span class="glyphicon glyphicon-list"></span>
            <span class="sidebar-nav-item">menu 0</span>
            <span class="glyphicon arrow"></span></a>
            <ul aria-expanded="false">
              <li><a href="#">item 0.1</a></li>
              <li><a href="#">item 0.2</a></li>
              <li><a href="http://onokumus.com">onokumus</a></li>
              <li><a href="#">item 0.4</a></li>
            </ul>
          </li>
          <li>
            <a href="#" aria-expanded="false">Menu 1 <span class="glyphicon arrow"></span></a>
            <ul aria-expanded="false">
              <li><a href="#">item 1.1</a></li>
              <li><a href="#">item 1.2</a></li>
              <li>
                <a href="#" aria-expanded="false">Menu 1.3 <span class="glyphicon arrow"></span></a>
                <ul aria-expanded="false">
                  <li><a href="#">item 1.3.1</a></li>
                  <li><a href="#">item 1.3.2</a></li>
                  <li><a href="#">item 1.3.3</a></li>
                  <li><a href="#">item 1.3.4</a></li>
                </ul>
              </li>
              <li><a href="#">item 1.4</a></li>
              <li>
                <a href="#" aria-expanded="false">Menu 1.5 <span class="glyphicon arrow"></span></a>
                <ul aria-expanded="false">
                  <li><a href="#">item 1.5.1</a></li>
                  <li><a href="#">item 1.5.2</a></li>
                  <li><a href="#">item 1.5.3</a></li>
                  <li><a href="#">item 1.5.4</a></li>
                </ul>
              </li>
            </ul>
          </li>
          <li>
            <a href="#" aria-expanded="false">Menu 2 <span class="glyphicon arrow"></span></a>
            <ul aria-expanded="false">
              <li><a href="#">item 2.1</a></li>
              <li><a href="#">item 2.2</a></li>
              <li><a href="#">item 2.3</a></li>
              <li><a href="#">item 2.4</a></li>
            </ul>
          </li>
        </ul>
      </nav>
    </aside>