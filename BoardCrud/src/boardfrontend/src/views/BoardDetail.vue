<template>
<div>게시판 조회</div>
<div>제목 : {{$route.params.title}}</div>
<div>내용 : {{$route.params.content}}</div>
<div>날짜 : {{$route.params.date}}</div>

<button v-on:click= "deleteboard"> 삭제 </button> 
<button  v-on:click= "golist"> 목록 </button> 

</template>


<script>
import axios from 'axios';


export default {
    data(){
        return {
            number : this.$route.params.number,
        }
    },
    methods : {
        read() {
             
         },
        deleteboard : function (){
            // this.number = Number(this.number);
            console.log(this.number);
             axios
                .post("http://localhost:9000/board/detail/delete",{id : this.number})
                .then(res => {
                alert("삭제되었습니다.");
                this.$router.push('/board');
                console.log(res)
                })
                .catch(err => {
                console.log(err);
                });
        },
        golist : function () {
            this.$router.push('/board');

        },
    },
    created() {
        this.read();
    }
  
};

</script>

<style>

</style>
