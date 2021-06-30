<template>
<div>게시판</div>
    <table class='table table-dark' border='2px'>
 <thead>
    <tr>
      <th scope='col'>번호</th>
      <th scope='col'>제목</th>
      <!-- <th scope='col'>내용</th> -->
      <th scope='col'>날짜</th>
    </tr>
  </thead>
  <tbody>
    <tr v-for="boards in board" :key="boards.id">
      <td >{{ boards.id }}</td>
      <td> <router-link :to="{ name: 'boarddetail', params: { number : boards.id  , title : boards.title , content : boards.content , date : boards.date}}"> {{ boards.title }} </router-link>
     
        </td>
      <!-- <td>{{ boards.content }}</td>? -->
      <td>{{ boards.date }} </td>
    </tr>
  </tbody>
  </table>
  <div>
<button v-on:click = 'resist'>등록</button>

  </div>

 

</template>


<script>
import axios from 'axios'


export default {
  data() {
    return {
      board : [],
      id : '',
      title : '',
      content : '',
    };
  },
  methods: {
    read() {
      axios
        .get("http://localhost:9000/board")
        .then(res => {
          this.board = res.data;
          this.board.date
          console.log(res)
        })
        .catch(err => {
          console.log(err);
        });
    },
    // detail : function(boards){
    //   this.board = boards
    //   console.log("data = " + this.board.id);
    //   console.log("data = " + this.board.title);
    //   console.log("data = " + this.board.content);
    //   console.log("data = " + this.board.date);

        // this.$router.push({name : 'boarddetail' , params : { number : board.id} })
    // },
    resist : function() {
      this.$router.push('/board/save');  
    }
    
  },
  created() {  
    this.read();
  }
};

</script>

<style>

</style>
