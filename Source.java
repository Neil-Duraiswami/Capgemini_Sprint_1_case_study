package Capgemini.case_study;

class Customer 
{
        private String userId;
        private String emailId;
        private String password;
        private String firstName;
        private String lastName;
        private String city;
        private String gender;
        private String phoneNumber;
        private Address address;
        private ServiceDetails serviceDetails;
        
        public Customer() {
                super();
        }
        public Customer(String userId, String emailId, String password, String firstName, String lastName, String city, String gender, String phoneNumber, Address address, ServiceDetails serviceDetails) {
                super();
                this.userId = userId;
                this.emailId = emailId;
                this.password = password;
                this.firstName = firstName;
                this.lastName = lastName;
                this.city = city;
                this.gender = gender;
                this.phoneNumber = phoneNumber;
                this.address = address;
                this.serviceDetails = serviceDetails;
        }
        public String getUserId() {
                return userId;
        }
        public void setUserId(String userId) {
                this.userId = userId;
        }
        public String getEmailId() {
                return emailId;
        }
        public void setEmailId(String emailId) {
                this.emailId = emailId;
        }
        public String getPassword() {
                return password;
        }
        public void setPassword(String password) {
                this.password = password;
        }
        public String getFirstName() {
                return firstName;
        }
        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }
        public String getLastName() {
                return lastName;
        }
        public void setLastName(String lastName) {
                this.lastName = lastName;
        }
        public String getCity() {
                return city;
        }
        public void setCity(String city) {
                this.city = city;
        }
        public String getGender() {
                return gender;
        }
        public void setGender(String gender) {
                this.gender = gender;
        }
        public String getPhoneNumber() {
                return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
        }
        public Address getAddress() {
                return address;
        }
        public void setAddress(Address address) {
                this.address = address;
        }
        public ServiceDetails getServiceDetails() {
                return serviceDetails;
        }
        public void setServiceDetails(ServiceDetails serviceDetails) {
                this.serviceDetails = serviceDetails;
        }
        @Override
        public String toString() {
                return "Customer [userId=" + userId + ", emailId=" + emailId + ", password=" + password + ", firstName="
                                + firstName + ", lastName=" + lastName + ", city=" + city + ", gender=" + gender + ", phoneNumber="
                                + phoneNumber + ", address=" + address + ", serviceDetails=" + serviceDetails + "]";
        }
}


class Address 
{
        private String city;
        private String state;
        private int zip;
        private String country;
        
        public Address() {
                super();
        }
        public Address(String city, String state, int zip, String country) {
                super();
                this.city = city;
                this.state = state;
                this.zip = zip;
                this.country = country;
        }
        @Override
        public String toString() {
                return "Address [city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
        }
}


class ServiceDetails
{
        private String serviceId;
        private String busId;
        private String deptDateTime;
        private String arrDateTime;
        private String arrivalCity;
        private String deptCity;
        private String cost;
        private String seatsLeft;
        private String totalSeats;
        
        public ServiceDetails() {
                super();
        }
        public ServiceDetails(String serviceId, String busId, String deptDateTime, String arrDateTime, String arrivalCity,
                        String deptCity, String cost, String seatsLeft, String totalSeats) {
                super();
                this.serviceId = serviceId;
                this.busId = busId;
                this.deptDateTime = deptDateTime;
                this.arrDateTime = arrDateTime;
                this.arrivalCity = arrivalCity;
                this.deptCity = deptCity;
                this.cost = cost;
                this.seatsLeft = seatsLeft;
                this.totalSeats = totalSeats;
        }
        public String getServiceId() {
                return serviceId;
        }
        public void setServiceId(String serviceId) {
                this.serviceId = serviceId;
        }
        public String getBusId() {
                return busId;
        }
        public void setBusId(String busId) {
                this.busId = busId;
        }
        public String getDeptDateTime() {
                return deptDateTime;
        }
        public void setDeptDateTime(String deptDateTime) {
                this.deptDateTime = deptDateTime;
        }
        public String getArrDateTime() {
                return arrDateTime;
        }
        public void setArrDateTime(String arrDateTime) {
                this.arrDateTime = arrDateTime;
        }
        public String getArrivalCity() {
                return arrivalCity;
        }
        public void setArrivalCity(String arrivalCity) {
                this.arrivalCity = arrivalCity;
        }
        public String getDeptCity() {
                return deptCity;
        }
        public void setDeptCity(String deptCity) {
                this.deptCity = deptCity;
        }
        public String getCost() {
                return cost;
        }
        public void setCost(String cost) {
                this.cost = cost;
        }
        public String getSeatsLeft() {
                return seatsLeft;
        }
        public void setSeatsLeft(String seatsLeft) {
                this.seatsLeft = seatsLeft;
        }
        public String getTotalSeats() {
                return totalSeats;
        }
        public void setTotalSeats(String totalSeats) {
                this.totalSeats = totalSeats;
        }
        @Override
        public String toString() {
                return "ServiceDetails [serviceId=" + serviceId + ", busId=" + busId + ", deptDateTime=" + deptDateTime
                                + ", arrDateTime=" + arrDateTime + ", arrivalCity=" + arrivalCity + ", deptCity=" + deptCity + ", cost="
                                + cost + ", seatsLeft=" + seatsLeft + ", totalSeats=" + totalSeats + "]";
        }
}


public class Source {
    public static void main(String args[]) 
    {
            Address address = new Address("Bangalore", "Karnataka", 123456, "India");
            ServiceDetails serviceDetails = new ServiceDetails("SID1001", "BUS001", "10/01/2022", "15/01/2022", "Bangalore", "Delhi", "2500", "9", "70");
            System.out.println(serviceDetails.toString());            
            Customer customer = new Customer("1001", "admin@gmail.com", "Password", "Raj", "Kumar", "Bangalore", "Male", "1234567890", address, serviceDetails);
            System.out.println(customer.toString());            
    }
}