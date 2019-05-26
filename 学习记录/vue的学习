在用别人的项目之前在npm run serve之前要先cnpm install

想要实现
<router-link :to='/bookdetail/'+item.id></router-link>
这样的路由时，可以用下面这个语句来实现
<router-link :to='`/bookdetail/${item.id}`'></router-link>
***

**vue**的往一个对象中添加之前没有的属性，不会触发渲染。页面上数据会保持不变。如果希望展示的话。需要用this.$set来添加属性，具体用法可以看API。
然后有的时候因为层次太复杂，这样也会失败。这就需要在set的语句前加上手动渲染this.$forceUpdate();
