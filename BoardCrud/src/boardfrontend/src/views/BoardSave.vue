<template>
<div>게시물 저장</div>
<div class = "form-group">
    <input type= "text" v-model="board.title"  placeholder="제목 입력" />
    <input type= "text" v-model="board.content" placeholder="내용 입력" />
    <input type = "file">
  </div>
    <button  v-on:click = "save" > 저장 </button>

 

 

 </template>


<script>
import axios from 'axios'


export default {
  data() {
    return {
      board :{
        title : '',
        content : '',
      },
      pageCount : '' , 

   
    };
  },
  methods: {
    save : function() {
            axios.post('http://localhost:9000/board/save ',this.board
            ).then(response => {
              console.log(this.content,this.title);
                console.log(response)
                alert('등록되었습니다.')
                this.$router.push('/board');
            }).catch((ex) => {
                console.warn("ERROR!!!!! : ",ex)
            })
        },
        
  },


};

</script>

<style>


</style>
