# security_wordladder
## 简介
使用springboot+oauth2认证对wordladder服务进行了安全包装。
wordladder服务置于https://localhost:8080/solver下，未经认证的访问会重定向到登陆页面。
## 登陆
- 可用用户名：user_1
- 密码：123456
## 授权
登陆页面拿到用户名与密码自动到授权服务器取得access_token,并重定向到主页面。
