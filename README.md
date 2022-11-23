### 一、项目开发环境

开发工具：Eclipse

项目内容：commons-math3-3.6.1

Git代码仓库：[github.com](https://github.com/CynthiaTsao/test05)

集成测试工具： Jenkins

缺陷管理：Github缺陷管理工具



### 二、测试步骤

在Jenkins中完成冒烟测试：

首先对Jenkins进行JDK和Maven配置；

配置完成后，在Jenkins首页点击“New Item”,选择创建Maven项目，点击OK完成创建；

在任务配置界面下的“源码管理”中选择“Git”，在Git的“Repository URL”中输入Git仓库URL地址，从而确定Jenkins需要跟踪的目标代码仓库；

Git仓库的访问需要用户授权，因此在Credentials中点击“Add”，添加Git的访问用户，在弹出的对话框中输入创建仓库的用户、密码，其他选项默认；

在任务配置界面的“Build Triggers”中选择“Poll SCM”，监控git仓库变更来即时进行构建，在“Schedule”中设置Git仓库的监控周期；

点击保存，即可完成MavenTest项目的自动构建配置，Jenkins工具会按设定的周期来监控Git代码仓库中的变更；

在进行监控自动构建后，Jenkins界面上会显示构建历史记录。如果构建成功，项目图标为蓝色标志，否则为红色。若为黄色感叹号，则表示项目构架成功，但项目中存在错误；

点击某次构建，可以看到项目构建的具体信息，如状态集、变更记录和控制台输出等；

点击“Workspace”，可以查看当前构建任务的工作空间，如图2-16。在工作空间中点击“all files in zip”即可获得新构建的软件版本。



### 三、缺陷提交步骤

进入issue提交缺陷，缺陷提交的格式要求为：“缺陷主题”->“参数设置”->“详细描述”，缺陷提交的流程为：发现缺陷->填写缺陷->提交缺陷。

