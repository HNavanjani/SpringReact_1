import React, { Component } from 'react'; 
 
class App extends Component {
constructor(props) {
	super(props);       
	this.state = {            
	products: []       
	} 
}
 
    componentDidMount() {
	const url = "sliit/products/";         
	fetch(url)             
	.then(response => response.json())             
	.then(json => this.setState({products: json}))     
	} 
 
    render() {         
	const {products} = this.state;         
	return (             
	<div className = "container" >                 
	<div class= "jumbotron" >                     
	<h1 class= "display-4" > Products </h1>                 
	</div>                 
	{                     
	products.map((product) => (                     
	<div className = "card" key = { product.id} >                         
	<div   className = "card-header" >                             
	#{ product.id} { product.name}                         
	</div>                         
	<div className = "card-body" >                             
	<p className = "card-text" > { product.description} </p>                         
	</div>                     
	</div>                     
	))                 
	}             
	</div> 
	);     
	} 
 
} 
 
 
export default App;