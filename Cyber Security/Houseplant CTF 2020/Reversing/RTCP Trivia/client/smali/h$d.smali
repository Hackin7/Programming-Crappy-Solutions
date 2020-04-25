.class final Lh$d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "d"
.end annotation


# instance fields
.field a:Lm;

.field b:Z

.field c:Landroid/content/BroadcastReceiver;

.field d:Landroid/content/IntentFilter;

.field final synthetic e:Lh;


# direct methods
.method constructor <init>(Lh;Lm;)V
    .locals 0

    iput-object p1, p0, Lh$d;->e:Lh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lh$d;->a:Lm;

    invoke-virtual {p2}, Lm;->a()Z

    move-result p1

    iput-boolean p1, p0, Lh$d;->b:Z

    return-void
.end method


# virtual methods
.method final a()V
    .locals 2

    iget-object v0, p0, Lh$d;->c:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh$d;->e:Lh;

    iget-object v0, v0, Lh;->b:Landroid/content/Context;

    iget-object v1, p0, Lh$d;->c:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lh$d;->c:Landroid/content/BroadcastReceiver;

    :cond_0
    return-void
.end method
