<template>
<div class="city">
    <p>{{title}}</p>
    <p>
      Enter city:
     <input class="blue" v-model="cityName">
   </p>
    <h2>{{countryName}}</h2></br>
    <h2>{{energyConsumption}}</h2></br>
    <h2>{{coalConsumption}}</h2></br>
    <h2>{{costCoal}}</h2>
    <h2>{{currency}}</h2>
    </br>


</div>
</template>
<script>
export default {
  name:'city',
  data(){
    return{
      title: 'Hello',
      cityName:'',
      countryName:'',
      energyConsumption:'',
      coalConsumption:'',
      costCoal:'',
      currency:''

    }
  },
  methods:{},
  watch: {
       cityName: function(){
         this.$http.get('http://localhost:8302/api/account-service/rest/account/accountmodel/Almaty').then(
           function(response){
             console.log(response.data);
          }
         );
        }
       },
}
</script>
<style scoped>
  .contacted{
    text-decoration: line-through;

  }
</style>
