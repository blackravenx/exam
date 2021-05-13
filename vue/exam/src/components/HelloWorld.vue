<template>
  <table>
    <th>ID</th>
    <th>имя</th>
    <tr v-for="item in json" :key="item">
      <td>{{item.id}}</td>
      <td>{{item.name}}</td>
      </tr>
  </table>

</template>

<script>
  export default {
    name: 'HelloWorld',
    data() {
      return {
        json: ''
      }
    },
    created() {
      this.axios.get("http://localhost:8080/data").then((response) => {
        this.json = response.data
      }).catch((e) => console.log(e))
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