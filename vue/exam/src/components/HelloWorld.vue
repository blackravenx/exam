<template>
  <table>
    <th>ID</th>
    <th>Имя</th>
    <th>Телефон</th>
    <tr v-for="item in data" :key="item">
      <td>{{item.id}}</td>
      <td>{{item.name}}</td>
      <td>{{item.tel}}</td>
    </tr>
  </table>
  <form action="#">

    <p> <label for="name">Имя</label>
      <input type="text" id="name" v-model="to_send.name"></p>
    <p> <label for="tel">Телефон</label>
      <input type="tel" id="tel" v-model="to_send.tel"></p>
    <p><button @click="submit">Отправить</button></p>

  </form>
</template>

<script>
  export default {
    name: 'HelloWorld',
    data() {
      return {
        to_send: {
          name: '',
          tel: ''
        },
        data: ''
      }
    },
    methods: {
      submit() {
        this.axios.post("http://localhost:8080/save", this.to_send).catch((e) => console.log(e))
      }
    },
    created() {
      this.axios.get("http://localhost:8080/data").then((response) => this.data = response.data).catch((e) => console
        .log(e))
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