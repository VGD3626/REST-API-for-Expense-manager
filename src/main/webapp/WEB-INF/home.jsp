<%--
  Created by IntelliJ IDEA.
  User: Vrund
  Date: 08-03-2024
  Time: 11:36 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="navbar.jsp" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<form action="addObj">
    <label>First name:</label><br>
    <input type="text" name="prop1" value="ghost"><br>
    <label>Last name:</label><br>
    <input type="text" name="prop2" value="has_been_arrived"><br><br>
    <input type="submit" value="Submit">
    <p>${first_obj.prop1} ${first_obj.prop2}</p>
</form>

<div class="container mt-5">
    <div class="row mt-4">
        <div class="col">
            <div class="card text-success">
                <div class="card-header">Total In(&#8377)</div>
                <div class="card-body">
                    <h2 class="TI">0.00</h2>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card text-secondary">
                <div class="card-header">Current Balance (&#8377)</div>
                <div class="card-body">
                    <h2 class="CB">0.00</h2>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card text-warning">
                <div class="card-header">Total Out (&#8377)</div>
                <div class="card-body">
                    <h2 class="TO">0.00</h2>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="container mt-4">
    <div class="card">
        <div class="card-header">
            Add Transaction
        </div>
        <div class="card-body">
            <form action="add_transaction.jsp" method="POST">
                <div class="form-row">
                    <div class="form-group">
                        <label for="amount">Amount:</label>
                        <input type="number" class="form-control" id="amount" name="amount" placeholder="Enter amount"
                               required>
                    </div>
                    <div class="form-group">
                        <label for="currency">Currency:</label>
                        <select class="form-control" id="currency" name="currency" required>
                            <option value="">Select currency</option>
                            <option value="USD">USD</option>
                            <option value="EUR">EUR</option>
                            <option value="GBP">GBP</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="f">Friends:</label>
                        <select class="form-control" id="f" name="friend">
                            <option value="">select a friend</option>
                            <option value="USD">f1</option>
                            <option value="EUR">f2</option>
                            <option value="GBP">f3</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label>Type:</label><br>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="type" id="income" value="income" required>
                        <label class="form-check-label" for="income">Income</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="type" id="expense" value="expense" required>
                        <label class="form-check-label" for="expense">Expense</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="type" id="expense" value="expense" required>
                        <label class="form-check-label" for="expense">Borrowing</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="type" id="expense" value="expense" required>
                        <label class="form-check-label" for="expense">Lending</label>
                    </div>
                </div>
                <div class="form-group">
                    <label for="category">Category:</label>
                    <select class="form-control" id="category" name="category" required>
                        <option value="">Select category</option>
                        <option value="Food">Food</option>
                        <option value="Transportation">Transportation</option>
                        <option value="Entertainment">Entertainment</option>
                        <!-- Add more options as needed -->
                    </select>
                </div>
                <div class="form-group">
                    <label for="description">Description:</label>
                    <textarea class="form-control" id="description" name="description" rows="3"
                              placeholder="Enter description"></textarea>
                </div>
                <button type="submit" class="btn btn-primary">Add Transaction</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>
