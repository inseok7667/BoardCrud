<template>
 <div>게시판</div>
    <table class='table table-dark' border='2px'>
  <thead>
    <tr>
      <th scope='col'>번호</th>
      <th scope='col'>제목</th>
      <th scope='col'>내용</th>
      <th scope='col'>날짜</th>
    </tr>
  </thead>
  <tbody>
    <tr v-for="boards in board" :key="boards.id">
      <td>{{ boards.id }}</td>
      <td>{{ boards.title }}</td>
      <td>{{ boards.content }}</td>
      <td>{{ boards.date }} </td>
    </tr>
  </tbody>
  </table>

  <div class = "form-group">
    <input type= "text" v-model="title" placeholder="제목 입력" />
    <input type= "text" v-model="content" placeholder="내용 입력" />
    <button v-on:click = "save" > 저장 </button>
  </div>

  <form>


  </form>
</template>


<script>
import axios from 'axios'

export default {
  name : 'App',
  components : {
  },
  data() {
    return {
      board : [],
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
    save : function() {
            axios.post('http://localhost:9000/board/save ',{ title:this.title, content:this.content }
            ).then(response => {
              console.log(this.content,this.title);
                console.log(response)
            }).catch((ex) => {
                console.warn("ERROR!!!!! : ",ex)
            })
        },
  },
  created() {  
    this.read();
  }
};

</script>

<style>

</style>
