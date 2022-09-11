import React from "react";
import {
  MDBBtn,
  MDBCard,
  MDBCardBody,
 // MDBCardImage,
  MDBInput,
  MDBCol,
  MDBContainer,
  MDBIcon,
  MDBRow,
} from "mdb-react-ui-kit";

export default function BuyerCart() {
  return (
    <section className="vh-100" style={{ backgroundColor: "#fdccbc" }}>
      <MDBContainer className="h-100">
        <MDBRow className="justify-content-center align-items-center h-100">
          <MDBCol>
            <p>
              <span className="h2">Shopping Cart </span>
              <span className="h4">(1 item in your cart)</span>
            </p>

            <MDBCard className="mb-4">
              <MDBCardBody className="p-4">
                <MDBRow className="align-items-center">
                  {/* <MDBCol md="2">
                    <MDBCardImage
                      fluid
                      src="https://mdbcdn.b-cdn.net/img/Photos/Horizontal/E-commerce/Products/1.webp"
                      alt="Generic placeholder image"
                    />
                  </MDBCol> */}
                  <MDBCol md="2" className="d-flex justify-content-center">
                    <div>
                      <p className="small text-muted mb-4 pb-2">Name</p>
                      <p className="lead fw-normal mb-0">tomato</p><br/>
                      <MDBInput wrapperClass='mb-4 w-100' label='Enter Product Name' id='Name' type='text' size="lg"/>
                    </div>
                  </MDBCol>
                  <MDBCol md="2" className="d-flex justify-content-center">
                    <div>
                      <p className="small text-muted mb-4 pb-2">Color</p>
                      <p className="lead fw-normal mb-0">
                     
                        <MDBIcon
                          fas
                          icon="circle me-2"
                          style={{ color: "#fdd8d2" }}
                        />
                        red  
                       
                      </p>
                      <br/>
                      <MDBInput wrapperClass='mb-4 w-100' label='Colour description' id='color' type='text' size="lg"/>
                    </div>
                  </MDBCol>
                  <MDBCol md="2" className="d-flex justify-content-center">
                    <div>
                      <p className="small text-muted mb-4 pb-2">Quantity</p>
                      <p className="lead fw-normal mb-0">1</p><br/>
                      <MDBInput wrapperClass='mb-4 w-100' label='Quantity' id='qty' type='number' size="lg"/>
                    </div>
                  </MDBCol>
                  <MDBCol md="2" className="d-flex justify-content-center">
                    <div>
                      <p className="small text-muted mb-4 pb-2">Price</p>
                      <p className="lead fw-normal mb-0">Rs40/kg</p><br/>
                      <MDBInput wrapperClass='mb-4 w-100' label='Expecteted Price' id='Price' type='number' size="lg"/>
                    </div>
                  </MDBCol>
                  <MDBCol md="2" className="d-flex justify-content-center">
                    <div>
                      <p className="small text-muted mb-4 pb-2">Total</p>
                      <p className="lead fw-normal mb-0">Rs40/kg</p><br/>
                      <MDBInput wrapperClass='mb-4 w-100' label='Total Price' id=' Total Price' type='number' size="lg"/>
                    </div>
                  </MDBCol>
                </MDBRow>
              </MDBCardBody>
            </MDBCard>

            <MDBCard className="mb-5">
              <MDBCardBody className="p-4">
                <div className="float-end">
                  <p className="mb-0 me-5 d-flex align-items-center">
                    <span className="small text-muted me-2">Order total:</span>
                    <span className="lead fw-normal">Rs40</span>
                  </p>
                </div>
              </MDBCardBody>
            </MDBCard>

            <div className="d-flex justify-content-end">
              <MDBBtn color="light" size="lg" className="me-2">
                Continue shopping
              </MDBBtn>
              <MDBBtn size="lg">Add to cart</MDBBtn>
            </div>
          </MDBCol>
        </MDBRow>
      </MDBContainer>
    </section>
  );
}