import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import huiyuanyouhui from '@/views/modules/huiyuanyouhui/list'
    import huiyuanbanli from '@/views/modules/huiyuanbanli/list'
    import yonghu from '@/views/modules/yonghu/list'
    import gequfenlei from '@/views/modules/gequfenlei/list'
    import huiyuanxinxi from '@/views/modules/huiyuanxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'
    import gequxinxi from '@/views/modules/gequxinxi/list'
    import discussgequxinxi from '@/views/modules/discussgequxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/huiyuanyouhui',
        name: '会员优惠',
        component: huiyuanyouhui
      }
      ,{
	path: '/huiyuanbanli',
        name: '会员办理',
        component: huiyuanbanli
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/gequfenlei',
        name: '歌曲分类',
        component: gequfenlei
      }
      ,{
	path: '/huiyuanxinxi',
        name: '会员信息',
        component: huiyuanxinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/gequxinxi',
        name: '歌曲信息',
        component: gequxinxi
      }
      ,{
	path: '/discussgequxinxi',
        name: '歌曲信息评论',
        component: discussgequxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
