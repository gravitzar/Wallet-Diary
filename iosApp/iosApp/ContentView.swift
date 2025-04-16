import SwiftUI
import UIKit
import shared

struct ContentView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        RootViewControllerKt.rootViewController()
    }

    func updateUIViewController(
        _ uiViewController: UIViewController,
        context: Context
    ) {
        // Update the UI if needed
    }
}

//struct ContentView_Previews: PreviewProvider {
//    static var previews: some View {
//        ContentView()
//    }
//}

struct RootView: View {
    var body: some View {
        ContentView()
            .ignoresSafeArea(.keyboard)
    }
}
