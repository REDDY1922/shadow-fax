import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter as Router } from "react-router-dom";
import App from "./App";
import { PendingOrdersProvider } from "./context/PendingOrdersContext"; // ✅ Import Context
import "./index.css";

const root = ReactDOM.createRoot(document.getElementById("root"));

root.render(
  <React.StrictMode>
    <Router>
      <PendingOrdersProvider>
        <App />
      </PendingOrdersProvider>
    </Router>
  </React.StrictMode>
);
