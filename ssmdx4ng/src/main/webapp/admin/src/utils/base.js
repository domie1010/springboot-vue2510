const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmdx4ng/",
            name: "ssmdx4ng",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmdx4ng/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "个人事务管理系统"
        } 
    }
}
export default base
