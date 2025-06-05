import logoDark from "./logo-dark.svg";
import logoLight from "./logo-light.svg";


export default function Welcome() {
  return (
    <div className="flex items-center justify-center min-h-screen  dark:from-gray-900 dark:to-gray-700">
      <h1 className="text-6xl font-bold text-white">Welcome to Tailwind!</h1>
    </div>
  );
}