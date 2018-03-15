template>
<div class="users">
  <form v-on:submit ="addUser">
    <input type="text" v-model="newUser.name"placeholder="EnterName">
    </br>
    <input type="text" v-model="newUser.email"placeholder="EnterEmail">
    </br>
    <input type="submit" value="Submit">

  </form>
<ul>

  <li v-for="user in users">
    <input type="checkbox" class="toggle"  v-model="user.contacted">
    <span class="contacted:user.contacted">
    {{user.name}}: {{user.email}} <button v-on:click = "deleteUser(user)"></button>
  </span>
  </li>
</ul>
</div>
</template>
<script>
export default {
  name:'users',
  data(){
    return{
      newUser:{},
      users:[
        /*{name: 'aisha',
         email: 'aisha@mail.ru',
         contacted: true},
         {name: 'adema',
          email: 'adema@mail.ru',
          contacted: true},
          {name: 'gulshat',
           email: 'gulshat@mail.ru',
           contacted: true}*/
      ]
    }
  },
  methods:{
    addUser: function(){
      console.log("added");
      this.users.push({
        name: this.newUser.name,
        email: this.newUser.email,
        contacted:true
      });
      e.preventDefault();
    },
    deleteUser:function(user){
      this.users.splice(this.users.indexOf(user),1);
    },
    created: function(){
      /*this.$http.get('https://jsonplaceholder.typicode.com/users').then(
        function(response){
          console.log(response.data);
         this.users = response.data;

       });*/
       this.$http.get('https://jsonplaceholder.typicode.com/users').then(
         function(response){
           console.log(response.data);

        }
       );
    }
}
}
</script>
<style scoped>
  .contacted{
    text-decoration: line-through;

  }
</style>
