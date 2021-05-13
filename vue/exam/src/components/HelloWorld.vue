<template>
    <p><label for="name">Ваше имя</label></p>
    <p><input id="name" v-model="name" type="text"></p>
    <button @click="submit">Отправить</button>
</template>

<script>
  export default {
    name: 'HelloWorld',
    data() {
      return {
        name: ''
      }
    },
    methods: {
      submit() {
        try {
          this.axios.post("http://localhost:8080/save", {
            name:this.name
          })
        }
        catch(e){
          console.log(e)
        }
      }
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  button {
    padding: 10px;
  }

  h3 {
    margin: 40px 0 0;
  }

  ul {
    list-style-type: none;
    padding: 0;
  }

  li {
    display: inline-block;
    margin: 0 10px;
  }

  a {
    color: #42b983;
  }
</style>